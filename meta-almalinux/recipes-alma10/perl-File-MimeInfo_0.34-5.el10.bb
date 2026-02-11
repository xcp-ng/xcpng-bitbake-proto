
PN = "perl-File-MimeInfo"
PE = "0"
PV = "0.34"
PR = "5.el10"
PACKAGES = "perl-File-MimeInfo perl-File-MimeInfo-tests"


URI_perl-File-MimeInfo = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/perl-File-MimeInfo-0.34-5.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-File-MimeInfo = " \
 perl-File-MimeInfo \
 perl-libs \
 perl-Carp \
 perl-interpreter \
 perl-Fcntl \
 perl-Encode \
 perl-Encode-Locale \
 perl-PathTools \
 perl-File-BaseDir \
 perl-File-DesktopEntry \
 perl-Exporter \
"

URI_perl-File-MimeInfo-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-File-MimeInfo-tests-0.34-5.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-File-MimeInfo-tests = " \
 perl-File-MimeInfo \
 perl-Test-Harness \
 perl-libs \
 desktop-file-utils \
 shared-mime-info \
 perl-Test-Simple \
 perl-PathTools \
 bash \
 perl-interpreter \
"
