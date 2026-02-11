
PN = "hyperv-daemons"
PE = "0"
PV = "0"
PR = "0.49.20220731git.el10"
PACKAGES = "hyperv-daemons hyperv-daemons-license hyperv-tools hypervfcopyd hypervkvpd hypervvssd"


URI_hyperv-daemons = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/hyperv-daemons-0-0.49.20220731git.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:hyperv-daemons = "hypervfcopyd ( =  0-0.49.20220731git.el10) hypervkvpd ( =  0-0.49.20220731git.el10) hypervvssd ( =  0-0.49.20220731git.el10)"
RPROVIDES:hyperv-daemons = "hyperv-daemons ( =  0-0.49.20220731git.el10) hyperv-daemons(x86-64) ( =  0-0.49.20220731git.el10)"

URI_hyperv-daemons-license = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/hyperv-daemons-license-0-0.49.20220731git.el10.noarch.rpm;unpack=0"
RDEPENDS:hyperv-daemons-license = ""
RPROVIDES:hyperv-daemons-license = "hyperv-daemons-license ( =  0-0.49.20220731git.el10)"

URI_hyperv-tools = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/hyperv-tools-0-0.49.20220731git.el10.noarch.rpm;unpack=0"
RDEPENDS:hyperv-tools = "/usr/bin/python3 ( )"
RPROVIDES:hyperv-tools = "hyperv-tools ( =  0-0.49.20220731git.el10)"

URI_hypervfcopyd = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/hypervfcopyd-0-0.49.20220731git.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:hypervfcopyd = "/bin/sh ( ) systemd ( ) rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) hyperv-daemons-license ( =  0-0.49.20220731git.el10)"
RPROVIDES:hypervfcopyd = "hypervfcopyd ( =  0-0.49.20220731git.el10) hypervfcopyd(x86-64) ( =  0-0.49.20220731git.el10)"

URI_hypervkvpd = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/hypervkvpd-0-0.49.20220731git.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:hypervkvpd = "/bin/sh ( ) systemd ( ) rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) /usr/bin/bash ( ) hyperv-daemons-license ( =  0-0.49.20220731git.el10)"
RPROVIDES:hypervkvpd = "hypervkvpd ( =  0-0.49.20220731git.el10) hypervkvpd(x86-64) ( =  0-0.49.20220731git.el10)"

URI_hypervvssd = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/hypervvssd-0-0.49.20220731git.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:hypervvssd = "/bin/sh ( ) systemd ( ) rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) hyperv-daemons-license ( =  0-0.49.20220731git.el10)"
RPROVIDES:hypervvssd = "hypervvssd ( =  0-0.49.20220731git.el10) hypervvssd(x86-64) ( =  0-0.49.20220731git.el10)"
