
inherit dnf-bridge

PN = "lorax-templates-rhel"
PE = "0"
PV = "10.0"
PR = "56.el10_0"
PACKAGES = "lorax-templates-rhel"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/lorax-templates-rhel-10.0-56.el10_0.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_lorax-templates-rhel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/lorax-templates-rhel-10.0-56.el10_0.noarch.rpm;unpack=0"
SRC_URI += "${URI_lorax-templates-rhel}"
RDEPENDS:lorax-templates-rhel = " \
 lorax \
"
