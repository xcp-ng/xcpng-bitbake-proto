
inherit dnf-bridge

PN = "perl-Encode-EUCJPASCII"
PE = "0"
PV = "0.03"
PR = "45.el10"
PACKAGES = "perl-Encode-EUCJPASCII perl-Encode-EUCJPASCII-tests"


URI_perl-Encode-EUCJPASCII = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-Encode-EUCJPASCII-0.03-45.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:perl-Encode-EUCJPASCII = " \
 perl-libs \
 perl-libs \
 perl-Encode \
 glibc \
 perl-base \
"

URI_perl-Encode-EUCJPASCII-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-Encode-EUCJPASCII-tests-0.03-45.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:perl-Encode-EUCJPASCII-tests = " \
 perl-Test-Harness \
 perl-libs \
 perl-Test-Simple \
 bash \
 perl-Encode-EUCJPASCII \
 perl-interpreter \
"
