
PN = "logwatch"
PE = "0"
PV = "7.11"
PR = "2.el10"
PACKAGES = "logwatch"


URI_logwatch = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/logwatch-7.11-2.el10.noarch.rpm;unpack=0"
RDEPENDS:logwatch = " \
 crontabs \
 perl-libs \
 perl-Socket \
 perl-Getopt-Long \
 perl-HTML-Parser \
 perl-subs \
 perl-vars \
 perl-lib \
 perl-Time-Local \
 perl-Date-Manip \
 perl-URI \
 grep \
 bash \
 perl-Errno \
 perl-Exporter \
 perl-diagnostics \
 perl-POSIX \
 perl-File-Basename \
 perl-PathTools \
 perl-interpreter \
 perl-File-Temp \
"
