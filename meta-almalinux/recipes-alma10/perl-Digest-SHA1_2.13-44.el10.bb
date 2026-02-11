
PN = "perl-Digest-SHA1"
PE = "0"
PV = "2.13"
PR = "44.el10"
PACKAGES = "perl-Digest-SHA1 perl-Digest-SHA1-tests"


URI_perl-Digest-SHA1 = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-Digest-SHA1-2.13-44.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:perl-Digest-SHA1 = " \
 perl-libs \
 perl-vars \
 perl-libs \
 perl-DynaLoader \
 glibc \
 perl-Exporter \
"

URI_perl-Digest-SHA1-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-Digest-SHA1-tests-2.13-44.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:perl-Digest-SHA1-tests = " \
 perl-Test \
 perl-Test-Harness \
 perl-vars \
 bash \
 perl-Digest-SHA1 \
 perl-interpreter \
"
