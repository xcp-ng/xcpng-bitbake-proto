
inherit dnf-bridge

PN = "perl-Net-SNMP"
PE = "0"
PV = "6.0.1"
PR = "43.el10"
PACKAGES = "perl-Net-SNMP perl-Net-SNMP-tests"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/perl-Net-SNMP-6.0.1-43.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_perl-Net-SNMP = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-Net-SNMP-6.0.1-43.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_perl-Net-SNMP}"
RDEPENDS:perl-Net-SNMP = " \
 perl-Math-BigInt \
 perl-libs \
 perl-Carp \
 perl-interpreter \
 perl-IO \
 perl-Digest-HMAC \
 perl-Digest-MD5 \
 perl-Socket \
 perl-Digest-SHA \
 perl-Crypt-DES \
 perl-Errno \
 perl-Exporter \
 perl-base \
 perl-Net-SNMP \
"

URI_perl-Net-SNMP-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-Net-SNMP-tests-6.0.1-43.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_perl-Net-SNMP-tests}"
RDEPENDS:perl-Net-SNMP-tests = " \
 perl-Test \
 perl-Test-Harness \
 perl-libs \
 bash \
 perl-interpreter \
 perl-Net-SNMP \
"
