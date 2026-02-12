
inherit dnf-bridge

PN = "setup"
PE = "0"
PV = "2.14.5"
PR = "4.el10"
PACKAGES = "setup"


URI_src = "https://vault.almalinux.org/10.0/BaseOS/Source/Packages/setup-2.14.5-4.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_setup = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/setup-2.14.5-4.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_setup}"
RDEPENDS:setup = " \
 almalinux-release \
"
