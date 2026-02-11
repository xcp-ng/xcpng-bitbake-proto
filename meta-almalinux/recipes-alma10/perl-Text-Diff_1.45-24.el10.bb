
PN = "perl-Text-Diff"
PE = "0"
PV = "1.45"
PR = "24.el10"
PACKAGES = "perl-Text-Diff perl-Text-Diff-tests"


URI_perl-Text-Diff = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-Text-Diff-1.45-24.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-Text-Diff = "
 perl-constant
 perl-libs
 perl-Carp
 perl-Text-Diff
 perl-Algorithm-Diff
 perl-Exporter
"

URI_perl-Text-Diff-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-Text-Diff-tests-1.45-24.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-Text-Diff-tests = "
 perl-Test
 perl-Test-Harness
 perl-libs
 perl-Test-Simple
 perl-Text-Diff
 bash
 perl-interpreter
 perl-Data-Dumper
"
