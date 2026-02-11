
inherit dnf-bridge

PN = "perl-Devel-GlobalDestruction"
PE = "0"
PV = "0.14"
PR = "27.el10"
PACKAGES = "perl-Devel-GlobalDestruction perl-Devel-GlobalDestruction-tests"


URI_perl-Devel-GlobalDestruction = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/perl-Devel-GlobalDestruction-0.14-27.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-Devel-GlobalDestruction = " \
 perl-libs \
 perl-Sub-Exporter-Progressive \
"

URI_perl-Devel-GlobalDestruction-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-Devel-GlobalDestruction-tests-0.14-27.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-Devel-GlobalDestruction-tests = " \
 perl-threads \
 perl-threads-shared \
 perl-Test-Harness \
 perl-libs \
 perl-FindBin \
 perl-POSIX \
 perl-IPC-Open3 \
 bash \
 perl-Devel-GlobalDestruction \
 perl-interpreter \
"
