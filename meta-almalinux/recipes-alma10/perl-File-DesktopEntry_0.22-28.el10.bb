
PN = "perl-File-DesktopEntry"
PE = "0"
PV = "0.22"
PR = "28.el10"
PACKAGES = "perl-File-DesktopEntry perl-File-DesktopEntry-tests"


URI_perl-File-DesktopEntry = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/perl-File-DesktopEntry-0.22-28.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-File-DesktopEntry = " \
 perl-libs \
 perl-Carp \
 perl-vars \
 perl-URI \
 perl-Encode \
 perl-PathTools \
 perl-File-BaseDir \
 perl-File-Path \
"

URI_perl-File-DesktopEntry-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-File-DesktopEntry-tests-0.22-28.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-File-DesktopEntry-tests = " \
 perl-Test-Harness \
 perl-libs \
 perl-Test-Simple \
 bash \
 perl-File-DesktopEntry \
 perl-interpreter \
"
