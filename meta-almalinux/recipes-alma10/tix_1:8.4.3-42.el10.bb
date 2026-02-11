
PN = "tix"
PE = "1"
PV = "8.4.3"
PR = "42.el10"
PACKAGES = "tix tix-devel tix-doc"


URI_tix = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/tix-8.4.3-42.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:tix = " \
 glibc \
 tk \
 libX11 \
 tcl \
"

URI_tix-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/tix-devel-8.4.3-42.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:tix-devel = " \
 tix \
"

URI_tix-doc = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/tix-doc-8.4.3-42.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:tix-doc = " \
 tix \
"
