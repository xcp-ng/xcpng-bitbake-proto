
PN = "libogg"
PE = "2"
PV = "1.3.5"
PR = "10.el10"
PACKAGES = "libogg libogg-devel libogg-devel-docs"


URI_libogg = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libogg-1.3.5-10.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libogg = " \
 glibc \
"

URI_libogg-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libogg-devel-1.3.5-10.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libogg-devel = " \
 automake \
 libogg \
 pkgconf-pkg-config \
"

URI_libogg-devel-docs = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/libogg-devel-docs-1.3.5-10.el10.noarch.rpm;unpack=0"
RDEPENDS:libogg-devel-docs = ""
