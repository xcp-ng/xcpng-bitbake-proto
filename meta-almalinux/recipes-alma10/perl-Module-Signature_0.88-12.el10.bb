
inherit dnf-bridge

PN = "perl-Module-Signature"
PE = "0"
PV = "0.88"
PR = "12.el10"
PACKAGES = "perl-Module-Signature perl-Module-Signature-tests"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/perl-Module-Signature-0.88-12.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_perl-Module-Signature = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-Module-Signature-0.88-12.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_perl-Module-Signature}"
RDEPENDS:perl-Module-Signature = " \
 perl-constant \
 gnupg2 \
 perl-libs \
 perl-ExtUtils-Manifest \
 perl-vars \
 perl-interpreter \
 perl-version \
 perl-IO \
 perl-Digest-SHA \
 perl-Text-Diff \
 perl-Module-Signature \
 perl-PathTools \
 perl-Exporter \
 perl-File-Temp \
"

URI_perl-Module-Signature-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-Module-Signature-tests-0.88-12.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_perl-Module-Signature-tests}"
RDEPENDS:perl-Module-Signature-tests = " \
 perl-IPC-Run \
 perl-Test-Harness \
 perl-libs \
 perl-Test-Simple \
 perl-FindBin \
 perl-Getopt-Long \
 perl-File-Basename \
 perl-Module-Signature \
 bash \
 perl-PathTools \
 perl-interpreter \
 perl-File-Path \
 perl-Data-Dumper \
 perl-lib \
 perl-Pod-Usage \
"
