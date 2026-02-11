
PN = "perl-Unicode-Normalize"
PE = "0"
PV = "1.32"
PR = "511.el10"
PACKAGES = "perl-Unicode-Normalize perl-Unicode-Normalize-tests"


URI_perl-Unicode-Normalize = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-Unicode-Normalize-1.32-511.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:perl-Unicode-Normalize = "
 glibc
 perl-Exporter
 perl-libs
 perl-Carp
"

URI_perl-Unicode-Normalize-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-Unicode-Normalize-tests-1.32-511.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:perl-Unicode-Normalize-tests = "
 perl-Test-Harness
 perl-libs
 perl-Unicode-Normalize
 bash
 perl-interpreter
"
