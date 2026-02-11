
PN = "perl-Data-UUID"
PE = "0"
PV = "1.227"
PR = "3.el10"
PACKAGES = "perl-Data-UUID perl-Data-UUID-tests"


URI_perl-Data-UUID = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/perl-Data-UUID-1.227-3.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:perl-Data-UUID = "
 perl-libs
 perl-Carp
 perl-Digest-MD5
 perl-DynaLoader
 glibc
 perl-Exporter
"

URI_perl-Data-UUID-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-Data-UUID-tests-1.227-3.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:perl-Data-UUID-tests = "
 perl-threads
 perl-Test-Harness
 perl-libs
 perl-Test-Simple
 perl-Data-UUID
 bash
 perl-interpreter
"
