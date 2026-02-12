
inherit dnf-bridge

PN = "libkcapi"
PE = "0"
PV = "1.5.0"
PR = "3.el10"
PACKAGES = "libkcapi libkcapi-hasher libkcapi-hmaccalc libkcapi-devel libkcapi-doc libkcapi-fipscheck libkcapi-static libkcapi-tests libkcapi-tools"


URI_src = "https://vault.almalinux.org/10.0/BaseOS/Source/Packages/libkcapi-1.5.0-3.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_libkcapi = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/libkcapi-1.5.0-3.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_libkcapi}"
RDEPENDS:libkcapi = " \
 glibc \
 systemd \
"

URI_libkcapi-hasher = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/libkcapi-hasher-1.5.0-3.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_libkcapi-hasher}"
RDEPENDS:libkcapi-hasher = " \
 glibc \
 libkcapi \
"

URI_libkcapi-hmaccalc = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/libkcapi-hmaccalc-1.5.0-3.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_libkcapi-hmaccalc}"
RDEPENDS:libkcapi-hmaccalc = " \
 libkcapi-hasher \
"

URI_libkcapi-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/libkcapi-devel-1.5.0-3.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_libkcapi-devel}"
RDEPENDS:libkcapi-devel = " \
 libkcapi \
 pkgconf-pkg-config \
"

URI_libkcapi-doc = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/libkcapi-doc-1.5.0-3.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_libkcapi-doc}"
RDEPENDS:libkcapi-doc = " \
 libkcapi \
"

URI_libkcapi-fipscheck = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/libkcapi-fipscheck-1.5.0-3.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_libkcapi-fipscheck}"
RDEPENDS:libkcapi-fipscheck = " \
 libkcapi-hasher \
"

URI_libkcapi-static = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/libkcapi-static-1.5.0-3.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_libkcapi-static}"
RDEPENDS:libkcapi-static = " \
 libkcapi-devel \
"

URI_libkcapi-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/libkcapi-tests-1.5.0-3.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_libkcapi-tests}"
RDEPENDS:libkcapi-tests = " \
 libkcapi \
 libkcapi-hmaccalc \
 openssl \
 libkcapi-tools \
 bash \
 glibc \
 coreutils \
 perl-interpreter \
"

URI_libkcapi-tools = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/libkcapi-tools-1.5.0-3.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_libkcapi-tools}"
RDEPENDS:libkcapi-tools = " \
 glibc \
 libkcapi \
 libkcapi-hasher \
"
