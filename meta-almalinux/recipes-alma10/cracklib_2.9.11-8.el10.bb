
inherit dnf-bridge

PN = "cracklib"
PE = "0"
PV = "2.9.11"
PR = "8.el10"
PACKAGES = "cracklib cracklib-dicts cracklib-devel"


URI_src = "https://vault.almalinux.org/10.0/BaseOS/Source/Packages/cracklib-2.9.11-8.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_cracklib = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/cracklib-2.9.11-8.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_cracklib}"
RDEPENDS:cracklib = " \
 glibc \
 gzip \
 zlib-ng-compat \
 bash \
"

URI_cracklib-dicts = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/cracklib-dicts-2.9.11-8.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_cracklib-dicts}"
RDEPENDS:cracklib-dicts = " \
 cracklib \
"

URI_cracklib-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/cracklib-devel-2.9.11-8.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_cracklib-devel}"
RDEPENDS:cracklib-devel = " \
 cracklib \
"
