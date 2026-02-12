
inherit dnf-bridge

PN = "mariadb-connector-c"
PE = "0"
PV = "3.4.4"
PR = "1.el10"
PACKAGES = "mariadb-connector-c mariadb-connector-c-config mariadb-connector-c-devel mariadb-connector-c-doc mariadb-connector-c-test"


URI_src = "https://vault.almalinux.org/10.0/BaseOS/Source/Packages/mariadb-connector-c-3.4.4-1.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_mariadb-connector-c = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/mariadb-connector-c-3.4.4-1.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_mariadb-connector-c}"
RDEPENDS:mariadb-connector-c = " \
 zlib-ng-compat \
 openssl-libs \
 libzstd \
 krb5-libs \
 mariadb-connector-c-config \
 libcurl \
 glibc \
"

URI_mariadb-connector-c-config = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/mariadb-connector-c-config-3.4.4-1.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_mariadb-connector-c-config}"
RDEPENDS:mariadb-connector-c-config = ""

URI_mariadb-connector-c-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/mariadb-connector-c-devel-3.4.4-1.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_mariadb-connector-c-devel}"
RDEPENDS:mariadb-connector-c-devel = " \
 zlib-ng-compat-devel \
 pkgconf-pkg-config \
 openssl-devel \
 mariadb-connector-c \
 glibc \
"

URI_mariadb-connector-c-doc = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/mariadb-connector-c-doc-3.4.4-1.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_mariadb-connector-c-doc}"
RDEPENDS:mariadb-connector-c-doc = " \
 mariadb-connector-c \
"

URI_mariadb-connector-c-test = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/mariadb-connector-c-test-3.4.4-1.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_mariadb-connector-c-test}"
RDEPENDS:mariadb-connector-c-test = " \
 zlib-ng-compat \
 openssl-libs \
 mariadb-connector-c \
 glibc \
 cmake \
"
