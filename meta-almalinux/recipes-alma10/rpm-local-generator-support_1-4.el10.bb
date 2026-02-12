
inherit dnf-bridge

PN = "rpm-local-generator-support"
PE = "0"
PV = "1"
PR = "4.el10"
PACKAGES = "rpm-local-generator-support"


URI_src = "https://vault.almalinux.org/10.0/devel/Source/Packages/rpm-local-generator-support-1-4.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_rpm-local-generator-support = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/rpm-local-generator-support-1-4.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_rpm-local-generator-support}"
RDEPENDS:rpm-local-generator-support = ""
