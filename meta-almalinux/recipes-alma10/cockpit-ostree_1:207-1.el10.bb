
inherit dnf-bridge

PN = "cockpit-ostree"
PE = "1"
PV = "207"
PR = "1.el10"
PACKAGES = "cockpit-ostree"


URI_cockpit-ostree = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/cockpit-ostree-207-1.el10.noarch.rpm;unpack=0"
RDEPENDS:cockpit-ostree = " \
 cockpit-bridge \
 rpm-ostree \
 cockpit-system \
"
