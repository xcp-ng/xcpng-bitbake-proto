inherit xcp-ng-rpm

SRCREV = "ac08ef27d5b02b9a7b3beedb091edb6406dc0280"
# FIXME why does kabichk with "required file not found"?
XCPNGDEV_BUILD_OPTS = " \
  --rpmbuild-opts='--without kabichk' \
"
