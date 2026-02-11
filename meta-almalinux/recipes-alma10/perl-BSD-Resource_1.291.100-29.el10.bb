
PN = "perl-BSD-Resource"
PE = "0"
PV = "1.291.100"
PR = "29.el10"
PACKAGES = "perl-BSD-Resource perl-BSD-Resource-tests"


URI_perl-BSD-Resource = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-BSD-Resource-1.291.100-29.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:perl-BSD-Resource = "
 perl-libs
 perl-Carp
 perl-vars
 perl-DynaLoader
 perl-AutoLoader
 glibc
 perl-Exporter
"

URI_perl-BSD-Resource-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-BSD-Resource-tests-1.291.100-29.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-BSD-Resource-tests = "
 perl-BSD-Resource
 perl-interpreter
 perl-Test-Harness
 bash
"
