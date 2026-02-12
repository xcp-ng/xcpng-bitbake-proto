
inherit dnf-bridge

PN = "tzdata"
PE = "0"
PV = "2025b"
PR = "1.el10"
PACKAGES = "tzdata tzdata-java"


URI_src = "https://vault.almalinux.org/10.0/BaseOS/Source/Packages/tzdata-2025b-1.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_tzdata = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/tzdata-2025b-1.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_tzdata}"
RDEPENDS:tzdata = ""

URI_tzdata-java = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/tzdata-java-2025b-1.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_tzdata-java}"
RDEPENDS:tzdata-java = ""
