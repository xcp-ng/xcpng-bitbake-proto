
PN = "tinycdb"
PE = "0"
PV = "0.80"
PR = "4.el10"
PACKAGES = "tinycdb tinycdb-devel"


URI_tinycdb = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/tinycdb-0.80-4.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:tinycdb = " \
 glibc \
"

URI_tinycdb-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/tinycdb-devel-0.80-4.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:tinycdb-devel = " \
 tinycdb \
 pkgconf-pkg-config \
"
