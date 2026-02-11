
PN = "setools"
PE = "0"
PV = "4.5.1"
PR = "4.el10"
PACKAGES = "python3-setools setools-console setools setools-console-analyses setools-gui"


URI_python3-setools = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/python3-setools-4.5.1-4.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:python3-setools = "rtld(GNU_HASH) ( ) libselinux.so.1()(64bit) ( ) libselinux.so.1(LIBSELINUX_1.0)(64bit) ( ) libc.so.6(GLIBC_2.14)(64bit) ( ) python3-setuptools ( ) libsepol.so.2()(64bit) ( ) libsepol.so.2(LIBSEPOL_1.0)(64bit) ( ) libsepol.so.2(LIBSEPOL_1.1)(64bit) ( ) python3.12dist(setuptools) ( ) python(abi) ( =  3.12)"
RPROVIDES:python3-setools = "python3-setools ( =  4.5.1-4.el10) python-setools ( =  4.5.1-4.el10) python3-setools(x86-64) ( =  4.5.1-4.el10) python3.12-setools ( =  4.5.1-4.el10) python3.12dist(setools) ( =  4.5.1) python3dist(setools) ( =  4.5.1)"

URI_setools-console = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/setools-console-4.5.1-4.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:setools-console = "/usr/bin/python3 ( ) python3-setools ( =  4.5.1-4.el10) libselinux ( >=  3.6)"
RPROVIDES:setools-console = "setools-console ( =  4.5.1-4.el10) setools-console(x86-64) ( =  4.5.1-4.el10)"

URI_setools = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/setools-4.5.1-4.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:setools = "setools-console-analyses ( =  4.5.1-4.el10) setools-gui ( =  4.5.1-4.el10) setools-console ( =  4.5.1-4.el10)"
RPROVIDES:setools = "setools ( =  4.5.1-4.el10) setools(x86-64) ( =  4.5.1-4.el10)"

URI_setools-console-analyses = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/setools-console-analyses-4.5.1-4.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:setools-console-analyses = "/usr/bin/python3 ( ) python3-networkx ( ) python3-setools ( =  4.5.1-4.el10) libselinux ( >=  3.6)"
RPROVIDES:setools-console-analyses = "setools-console-analyses ( =  4.5.1-4.el10) setools-console-analyses(x86-64) ( =  4.5.1-4.el10)"

URI_setools-gui = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/setools-gui-4.5.1-4.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:setools-gui = "/usr/bin/python3 ( ) python3-networkx ( ) python3-pyqt6 ( ) python3-pyqt6-sip ( ) python(abi) ( =  3.12) python3-setools ( =  4.5.1-4.el10)"
RPROVIDES:setools-gui = "setools-gui ( =  4.5.1-4.el10) setools-gui(x86-64) ( =  4.5.1-4.el10)"
