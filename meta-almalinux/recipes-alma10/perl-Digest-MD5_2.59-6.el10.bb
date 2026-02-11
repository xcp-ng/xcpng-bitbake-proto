
inherit dnf-bridge

PN = "perl-Digest-MD5"
PE = "0"
PV = "2.59"
PR = "6.el10"
PACKAGES = "perl-Digest-MD5 perl-Digest-MD5-tests"


URI_perl-Digest-MD5 = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-Digest-MD5-2.59-6.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:perl-Digest-MD5 = " \
 glibc \
 perl-Exporter \
 perl-libs \
 perl-Digest \
"

URI_perl-Digest-MD5-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-Digest-MD5-tests-2.59-6.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:perl-Digest-MD5-tests = " \
 perl-threads \
 perl-Test-Harness \
 perl-libs \
 perl-Test-Simple \
 perl-vars \
 perl-Digest-MD5 \
 perl-Encode \
 bash \
 perl-interpreter \
"
