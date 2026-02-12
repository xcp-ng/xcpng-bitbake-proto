
inherit dnf-bridge

PN = "gawk"
PE = "0"
PV = "5.3.0"
PR = "6.el10"
PACKAGES = "gawk gawk-all-langpacks gawk-devel gawk-doc"


URI_src = "https://vault.almalinux.org/10.0/BaseOS/Source/Packages/gawk-5.3.0-6.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_gawk = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/gawk-5.3.0-6.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_gawk}"
RDEPENDS:gawk = " \
 gmp \
 mpfr \
 readline \
 bash \
 glibc \
 filesystem \
"

URI_gawk-all-langpacks = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/gawk-all-langpacks-5.3.0-6.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_gawk-all-langpacks}"
RDEPENDS:gawk-all-langpacks = ""

URI_gawk-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/gawk-devel-5.3.0-6.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_gawk-devel}"
RDEPENDS:gawk-devel = " \
 gawk \
"

URI_gawk-doc = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/gawk-doc-5.3.0-6.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_gawk-doc}"
RDEPENDS:gawk-doc = " \
 gawk \
"
