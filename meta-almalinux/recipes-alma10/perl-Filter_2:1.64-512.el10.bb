
PN = "perl-Filter"
PE = "2"
PV = "1.64"
PR = "512.el10"
PACKAGES = "perl-Filter perl-Filter-tests"


URI_perl-Filter = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-Filter-1.64-512.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:perl-Filter = " \
 perl-libs \
 perl-Carp \
 perl-Filter \
 glibc \
 perl-Exporter \
"

URI_perl-Filter-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-Filter-tests-1.64-512.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:perl-Filter-tests = " \
 perl-Test-Harness \
 perl-libs \
 perl-debugger \
 perl-vars \
 perl-Filter \
 perl-FindBin \
 bash \
 perl-PathTools \
 perl-interpreter \
 perl-lib \
"
