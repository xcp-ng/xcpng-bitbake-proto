
inherit dnf-bridge

PN = "butane"
PE = "0"
PV = "0.23.0"
PR = "1.el10"
PACKAGES = "butane butane-redistributable"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/butane-0.23.0-1.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_butane = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/butane-0.23.0-1.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_butane}"
RDEPENDS:butane = " \
 glibc \
"

URI_butane-redistributable = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/butane-redistributable-0.23.0-1.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_butane-redistributable}"
RDEPENDS:butane-redistributable = ""
