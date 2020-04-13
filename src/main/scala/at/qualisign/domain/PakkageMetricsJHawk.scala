package at.qualisign.domain

case class PakkageMetricsJHawk(
  pakkage: String,
  abstractness: Double,
  avcc: Double,
  cumulativeNumberOfCommentLines: Int,
  cumulativeNumberOfComments: Int,
  distance: Double,
  fanin: Int,
  fanout: Int,
  halsteadCumulativeBugs: Double,
  halsteadCumulativeLength: Int,
  halsteadCumulativeVolume: Double,
  halsteadEffort: Double,
  instability: Double,
  loc: Int,
  maintainabilityIndex: Double,
  maintainabilityIndexNC: Double,
  maxcc: Int,
  numberOfClasses: Int,
  numberOfMethods: Int,
  numberOfStatements: Int,
  rvf: Int,
  tcc: Int,
)