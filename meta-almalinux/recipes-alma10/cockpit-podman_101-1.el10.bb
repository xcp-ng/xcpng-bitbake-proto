
inherit dnf-bridge

PN = "cockpit-podman"
PE = "0"
PV = "101"
PR = "1.el10"
PACKAGES = "cockpit-podman"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/cockpit-podman-101-1.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_cockpit-podman = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/cockpit-podman-101-1.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_cockpit-podman}"
RDEPENDS:cockpit-podman = " \
 podman \
 cockpit-bridge \
"
