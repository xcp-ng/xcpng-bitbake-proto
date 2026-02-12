
inherit dnf-bridge

PN = "ldns"
PE = "0"
PV = "1.8.3"
PR = "18.el10"
PACKAGES = "ldns ldns-devel ldns-doc ldns-utils perl-ldns python3-ldns"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/ldns-1.8.3-18.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_ldns = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/ldns-1.8.3-18.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_ldns}"
RDEPENDS:ldns = " \
 glibc \
 openssl-libs \
 ca-certificates \
"

URI_ldns-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/ldns-devel-1.8.3-18.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_ldns-devel}"
RDEPENDS:ldns-devel = " \
 openssl-devel \
 bash \
 pkgconf-pkg-config \
 ldns \
"

URI_ldns-doc = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/ldns-doc-1.8.3-18.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_ldns-doc}"
RDEPENDS:ldns-doc = ""

URI_ldns-utils = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/ldns-utils-1.8.3-18.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_ldns-utils}"
RDEPENDS:ldns-utils = " \
 glibc \
 openssl-libs \
 libpcap \
 ldns \
"

URI_perl-ldns = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/perl-ldns-1.8.3-18.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_perl-ldns}"
RDEPENDS:perl-ldns = " \
 perl-libs \
 perl-Carp \
 ldns \
 perl-ldns \
 perl-AutoLoader \
 glibc \
 perl-Exporter \
"

URI_python3-ldns = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/python3-ldns-1.8.3-18.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_python3-ldns}"
RDEPENDS:python3-ldns = " \
 python3 \
 ldns \
 openssl-libs \
 python3-libs \
 glibc \
"
