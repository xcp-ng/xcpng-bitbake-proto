
inherit dnf-bridge

PN = "perl-Authen-SASL"
PE = "0"
PV = "2.1700"
PR = "5.el10"
PACKAGES = "perl-Authen-SASL perl-Authen-SASL-tests"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/perl-Authen-SASL-2.1700-5.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_perl-Authen-SASL = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-Authen-SASL-2.1700-5.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_perl-Authen-SASL}"
RDEPENDS:perl-Authen-SASL = " \
 perl-libs \
 perl-Carp \
 perl-vars \
 perl-Digest-HMAC \
 perl-Digest-MD5 \
 perl-GSSAPI \
 perl-Tie \
"

URI_perl-Authen-SASL-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-Authen-SASL-tests-2.1700-5.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_perl-Authen-SASL-tests}"
RDEPENDS:perl-Authen-SASL-tests = " \
 perl-Test-Harness \
 perl-libs \
 perl-Test-Simple \
 perl-Carp \
 perl-Digest-HMAC \
 perl-Digest-MD5 \
 perl-FindBin \
 perl-Authen-SASL \
 bash \
 perl-interpreter \
"
