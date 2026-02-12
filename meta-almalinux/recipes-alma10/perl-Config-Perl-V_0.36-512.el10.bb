
inherit dnf-bridge

PN = "perl-Config-Perl-V"
PE = "0"
PV = "0.36"
PR = "512.el10"
PACKAGES = "perl-Config-Perl-V perl-Config-Perl-V-tests"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/perl-Config-Perl-V-0.36-512.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_perl-Config-Perl-V = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-Config-Perl-V-0.36-512.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_perl-Config-Perl-V}"
RDEPENDS:perl-Config-Perl-V = " \
 perl-Exporter \
 perl-libs \
 perl-vars \
"

URI_perl-Config-Perl-V-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-Config-Perl-V-tests-0.36-512.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_perl-Config-Perl-V-tests}"
RDEPENDS:perl-Config-Perl-V-tests = " \
 perl-Test-Harness \
 perl-libs \
 perl-Test-Simple \
 perl-Digest-MD5 \
 perl-Config-Perl-V \
 bash \
 perl-interpreter \
 perl-Test-NoWarnings \
"
