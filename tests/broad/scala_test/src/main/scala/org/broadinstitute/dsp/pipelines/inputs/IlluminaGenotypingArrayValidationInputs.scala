package org.broadinstitute.dsp.pipelines.inputs

import java.net.URI

import io.circe.{Decoder, Encoder}
import io.circe.generic.extras.semiauto.{
  deriveConfiguredDecoder,
  deriveConfiguredEncoder
}

object IlluminaGenotypingArrayValidationInputs
    extends EncodableInputs[IlluminaGenotypingArrayValidationInputs] {
  override def workflowNames: Seq[String] = Seq("VerifyIlluminaGenotypingArray")
  override implicit val decoder
    : Decoder[IlluminaGenotypingArrayValidationInputs] =
    deriveConfiguredDecoder
  override implicit val encoder
    : Encoder[IlluminaGenotypingArrayValidationInputs] =
    deriveConfiguredEncoder
}
case class IlluminaGenotypingArrayValidationInputs(
    truth_metrics: Seq[URI],
    test_metrics: Seq[URI],
    test_gtc: URI,
    truth_gtc: URI,
    bead_pool_manifest_file: URI,
    truth_vcf: URI,
    test_vcf: URI,
    truth_fp_vcf: URI,
    test_fp_vcf: URI,
    truth_green_idat_md5: URI,
    test_green_idat_md5: URI,
    truth_red_idat_md5: URI,
    test_red_idat_md5: URI
)
