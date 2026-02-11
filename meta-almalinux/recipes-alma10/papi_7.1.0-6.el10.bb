
inherit dnf-bridge

PN = "papi"
PE = "0"
PV = "7.1.0"
PR = "6.el10"
PACKAGES = "papi papi-devel papi-libs papi-testsuite"


URI_papi = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/papi-7.1.0-6.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:papi = " \
 glibc \
 papi-libs \
 python3 \
"

URI_papi-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/papi-devel-7.1.0-6.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:papi-devel = " \
 papi-libs \
 pkgconf-pkg-config \
 papi \
"

URI_papi-libs = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/papi-libs-7.1.0-6.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:papi-libs = " \
 glibc \
 libpfm \
"

URI_papi-testsuite = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/papi-testsuite-7.1.0-6.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:papi-testsuite = " \
 papi-libs \
 libgcc \
 libgfortran \
 libgomp \
 bash \
 papi \
 glibc \
"
