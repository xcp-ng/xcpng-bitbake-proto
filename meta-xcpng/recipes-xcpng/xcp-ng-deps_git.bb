inherit xcp-ng-rpm

SRCREV = "57fa2cda54ecb4dfac22ea7fe86bc798dda4e224"

RDEPENDS = " \
xcp-ng-release \
xcp-ng-config \
kernel \
blktap \
guest-templates-json \
varstored \
vncterm \
xapi \
xo-lite \
xsconsole \
xcp-ng-pv-tools \
xcp-ng-xapi-plugins \
xcp-featured \
"

# pulls qemu, not yet on aarch64
RDEPENDS:remove:aarch64 = "vncterm"
