inherit xcp-ng-rpm

SRCREV = "4ca137355c888fec0125b362683453ef22960531"

DEPENDS = " \
  xs-opam-repo \
  xapi \
"
# We only need xapi-{idl,client}-devel and their runtime deps: other xapi
# subpackages, xapi's rdeps-extra (jemalloc) and xs-opam-repo.  Waiting
# for xapi's full closure would be a loop (xapi-core Requires xcp-featured).
DEPENDS_RPMS_ONLY = "xapi"
