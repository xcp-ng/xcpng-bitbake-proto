
PN = "perl-Sub-Exporter"
PE = "0"
PV = "0.991"
PR = "7.el10"
PACKAGES = "perl-Sub-Exporter perl-Sub-Exporter-tests"


URI_perl-Sub-Exporter = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-Sub-Exporter-0.991-7.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-Sub-Exporter = "
 perl-libs
 perl-Carp
 perl-Sub-Exporter
 perl-Package-Generator
 perl-Sub-Install
 perl-Params-Util
 perl-Data-OptList
"

URI_perl-Sub-Exporter-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-Sub-Exporter-tests-0.991-7.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-Sub-Exporter-tests = "
 perl-subs
 perl-Test-Harness
 perl-libs
 perl-Test-Simple
 perl-Carp
 perl-ExtUtils-MakeMaker
 perl-Data-OptList
 perl-Sub-Exporter
 perl-overload
 bash
 perl-PathTools
 perl-base
 perl-interpreter
 perl-Exporter
 perl-lib
"
