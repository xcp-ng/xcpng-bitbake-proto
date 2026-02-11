
PN = "perl-HTTP-Message"
PE = "0"
PV = "6.45"
PR = "5.el10"
PACKAGES = "perl-HTTP-Message perl-HTTP-Message-tests"


URI_perl-HTTP-Message = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-HTTP-Message-6.45-5.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-HTTP-Message = "
 perl-libs
 perl-Carp
 perl-URI
 perl-IO-Compress
 perl-Clone
 perl-IO-HTML
 perl-Compress-Raw-Zlib
 perl-Encode
 perl-Encode-Locale
 perl-PathTools
 perl-parent
 perl-LWP-MediaTypes
 perl-HTTP-Date
 perl-HTTP-Message
 perl-Exporter
 perl-MIME-Base64
"

URI_perl-HTTP-Message-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-HTTP-Message-tests-6.45-5.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-HTTP-Message-tests = "
 perl-Test-Harness
 perl-libs
 perl-ExtUtils-MakeMaker
 perl-Try-Tiny
 perl-URI
 perl-Test-Simple
 perl-Compress-Raw-Zlib
 perl-Encode
 perl-File-Temp
 perl-overload
 perl-PathTools
 bash
 perl-Test-Needs
 perl-HTTP-Message
 perl-interpreter
 perl-lib
"
