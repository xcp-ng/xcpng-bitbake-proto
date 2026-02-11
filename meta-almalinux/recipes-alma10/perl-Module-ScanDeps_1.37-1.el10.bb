
PN = "perl-Module-ScanDeps"
PE = "0"
PV = "1.37"
PR = "1.el10"
PACKAGES = "perl-Module-ScanDeps perl-Module-ScanDeps-tests"


URI_perl-Module-ScanDeps = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/perl-Module-ScanDeps-1.37-1.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-Module-ScanDeps = " \
 perl-Scalar-List-Utils \
 perl-libs \
 perl-FileHandle \
 perl-FindBin \
 perl-Module-ScanDeps \
 perl-Getopt-Long \
 perl-B \
 perl-subs \
 perl-vars \
 perl-version \
 perl-Text-ParseWords \
 perl-Data-Dumper \
 perl-DynaLoader \
 perl-Encode \
 perl-Module-Metadata \
 perl-Exporter \
 perl-constant \
 perl-ExtUtils-MakeMaker \
 perl-File-Basename \
 perl-PathTools \
 perl-File-Find \
 perl-interpreter \
 perl-File-Path \
 perl-File-Temp \
"

URI_perl-Module-ScanDeps-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-Module-ScanDeps-tests-1.37-1.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-Module-ScanDeps-tests = " \
 perl-libnet \
 perl-IPC-Run3 \
 perl-libs \
 perl-FindBin \
 perl-Module-ScanDeps \
 perl-AutoLoader \
 perl-Test-Requires \
 perl-Test-Harness \
 perl-Test-Simple \
 perl-Carp \
 perl-version \
 perl-lib \
 perl-Data-Dumper \
 perl-DynaLoader \
 bash \
 perl-Exporter \
 perl-autouse \
 perl-File-Basename \
 perl-PathTools \
 perl-if \
 perl-interpreter \
 perl-less \
 perl-File-Temp \
"
