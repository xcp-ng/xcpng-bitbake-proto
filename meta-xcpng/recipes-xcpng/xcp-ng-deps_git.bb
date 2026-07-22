inherit xcp-ng-rpm

SRCREV = "19888e9b0dedf3723b5ddc624f4b08966f0206fe"

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
