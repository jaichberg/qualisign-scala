package at.qualisign.metrics.jhawk

import java.io.File

trait JHawkMetricsCalculator {
  def calculateMetrics(from: File, to: File, error: File) : Unit
}
