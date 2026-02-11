
PN = "perl-Clone"
PE = "0"
PV = "0.46"
PR = "10.el10"
PACKAGES = "perl-Clone perl-Clone-tests"


URI_perl-Clone = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-Clone-0.46-10.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:perl-Clone = " \
 glibc \
 perl-Exporter \
 perl-libs \
 perl-AutoLoader \
"

URI_perl-Clone-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-Clone-tests-0.46-10.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-Clone-tests = " \
 perl-Test-Harness \
 perl-libs \
 perl-Test-Simple \
 perl-vars \
 perl-B-COW \
 perl-Clone \
 bash \
 perl-B \
 perl-interpreter \
"
