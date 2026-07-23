inherit xcp-ng-rpm

SRCREV = "3b348bb9c6630b7e29b5e1d07ff2403e873ec331"
# FIXME why does kabichk with "required file not found"?
XCPNGDEV_BUILD_OPTS = " \
  --rpmbuild-opts='--without kabichk' \
"
