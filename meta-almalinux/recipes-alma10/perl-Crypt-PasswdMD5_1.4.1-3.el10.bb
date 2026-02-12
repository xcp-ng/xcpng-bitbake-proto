
inherit dnf-bridge

PN = "perl-Crypt-PasswdMD5"
PE = "0"
PV = "1.4.1"
PR = "3.el10"
PACKAGES = "perl-Crypt-PasswdMD5"


URI_src = "https://vault.almalinux.org/10.0/devel/Source/Packages/perl-Crypt-PasswdMD5-1.4.1-3.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_perl-Crypt-PasswdMD5 = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-Crypt-PasswdMD5-1.4.1-3.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_perl-Crypt-PasswdMD5}"
RDEPENDS:perl-Crypt-PasswdMD5 = " \
 perl-Digest-MD5 \
 perl-Exporter \
 perl-libs \
 perl-libs \
"
