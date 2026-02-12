
inherit dnf-bridge

PN = "perl-LDAP"
PE = "1"
PV = "0.68"
PR = "16.el10"
PACKAGES = "perl-LDAP perl-LDAP-tests"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/perl-LDAP-0.68-16.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_perl-LDAP = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-LDAP-0.68-16.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_perl-LDAP}"
RDEPENDS:perl-LDAP = " \
 perl-libs \
 perl-libwww-perl \
 perl-Socket \
 perl-Authen-SASL \
 perl-HTTP-Message \
 perl-HTTP-Negotiate \
 perl-Carp \
 perl-IO \
 perl-Text-Soundex \
 perl-IO-Socket-SSL \
 perl-Convert-ASN1 \
 perl-JSON \
 perl-LDAP \
 perl-LWP-MediaTypes \
 perl-Time-Local \
 perl-MIME-Base64 \
 perl-Encode \
 perl-Exporter \
 perl-base \
 perl-constant \
"

URI_perl-LDAP-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-LDAP-tests-0.68-16.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_perl-LDAP-tests}"
RDEPENDS:perl-LDAP-tests = " \
 perl-Test-Harness \
 perl-Test-Simple \
 perl-IO \
 perl-Text-Soundex \
 perl-File-Basename \
 perl-File-Compare \
 perl-Convert-ASN1 \
 perl-PathTools \
 bash \
 perl-LDAP \
 coreutils \
 perl-interpreter \
 perl-File-Path \
"
