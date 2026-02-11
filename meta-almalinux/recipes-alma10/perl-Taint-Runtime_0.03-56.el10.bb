
PN = "perl-Taint-Runtime"
PE = "0"
PV = "0.03"
PR = "56.el10"
PACKAGES = "perl-Taint-Runtime perl-Taint-Runtime-tests"


URI_perl-Taint-Runtime = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/perl-Taint-Runtime-0.03-56.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:perl-Taint-Runtime = "
 perl-libs
 perl-Carp
 perl-interpreter
 perl-vars
 glibc
 perl-Taint-Runtime
 perl-Exporter
 perl-Benchmark
"

URI_perl-Taint-Runtime-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-Taint-Runtime-tests-0.03-56.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:perl-Taint-Runtime-tests = "
 perl-Test-Harness
 perl-Test-Simple
 bash
 perl-Taint-Runtime
 perl-interpreter
"
