
inherit dnf-bridge

PN = "opencryptoki"
PE = "0"
PV = "3.24.0"
PR = "6.el10_0"
PACKAGES = "opencryptoki opencryptoki-ccatok opencryptoki-icsftok opencryptoki-libs opencryptoki-swtok opencryptoki-devel"


URI_src = "https://vault.almalinux.org/10.0/BaseOS/Source/Packages/opencryptoki-3.24.0-6.el10_0.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_opencryptoki = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/opencryptoki-3.24.0-6.el10_0.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_opencryptoki}"
RDEPENDS:opencryptoki = " \
 systemd \
 diffutils \
 openssl-libs \
 libcap \
 bash \
 glibc \
 coreutils \
 opencryptoki-libs \
 opencryptoki-swtok \
 selinux-policy \
"

URI_opencryptoki-ccatok = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/opencryptoki-ccatok-3.24.0-6.el10_0.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_opencryptoki-ccatok}"
RDEPENDS:opencryptoki-ccatok = " \
 glibc \
 opencryptoki-libs \
 openssl-libs \
 openldap \
"

URI_opencryptoki-icsftok = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/opencryptoki-icsftok-3.24.0-6.el10_0.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_opencryptoki-icsftok}"
RDEPENDS:opencryptoki-icsftok = " \
 glibc \
 opencryptoki-libs \
 openssl-libs \
 openldap \
"

URI_opencryptoki-libs = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/opencryptoki-libs-3.24.0-6.el10_0.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_opencryptoki-libs}"
RDEPENDS:opencryptoki-libs = " \
 shadow-utils \
 libgcc \
 openssl-libs \
 bash \
 glibc \
"

URI_opencryptoki-swtok = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/opencryptoki-swtok-3.24.0-6.el10_0.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_opencryptoki-swtok}"
RDEPENDS:opencryptoki-swtok = " \
 glibc \
 opencryptoki-libs \
 openssl-libs \
 openldap \
"

URI_opencryptoki-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/opencryptoki-devel-3.24.0-6.el10_0.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_opencryptoki-devel}"
RDEPENDS:opencryptoki-devel = " \
 opencryptoki-libs \
 pkgconf-pkg-config \
"
