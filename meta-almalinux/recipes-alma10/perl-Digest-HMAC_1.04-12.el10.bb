
inherit dnf-bridge

PN = "perl-Digest-HMAC"
PE = "0"
PV = "1.04"
PR = "12.el10"
PACKAGES = "perl-Digest-HMAC perl-Digest-HMAC-tests"


URI_perl-Digest-HMAC = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-Digest-HMAC-1.04-12.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-Digest-HMAC = " \
 perl-libs \
 perl-vars \
 perl-Digest-HMAC \
 perl-Digest-MD5 \
 perl-Digest-SHA \
 perl-Exporter \
"

URI_perl-Digest-HMAC-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-Digest-HMAC-tests-1.04-12.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-Digest-HMAC-tests = " \
 perl-Digest-HMAC \
 perl-interpreter \
 perl-Test-Harness \
 bash \
"
