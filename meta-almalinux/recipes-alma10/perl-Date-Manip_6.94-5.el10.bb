
PN = "perl-Date-Manip"
PE = "0"
PV = "6.94"
PR = "5.el10"
PACKAGES = "perl-Date-Manip perl-Date-Manip-tests"


URI_perl-Date-Manip = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-Date-Manip-6.94-5.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-Date-Manip = "
 perl-Date-Manip
 perl-libs
 perl-Carp
 perl-interpreter
 perl-IO
 perl-Storable
 perl-Encode
 perl-PathTools
 perl-File-Find
 perl-Exporter
 perl-Data-Dumper
"

URI_perl-Date-Manip-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-Date-Manip-tests-6.94-5.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-Date-Manip-tests = "
 perl-Date-Manip
 perl-Test-Harness
 perl-libs
 perl-Test-Inter
 bash
 perl-interpreter
"
