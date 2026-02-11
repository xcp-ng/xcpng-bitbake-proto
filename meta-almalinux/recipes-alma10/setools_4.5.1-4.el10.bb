
PN = "setools"
PE = "0"
PV = "4.5.1"
PR = "4.el10"
PACKAGES = "python3-setools setools-console setools setools-console-analyses setools-gui"


URI_python3-setools = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/python3-setools-4.5.1-4.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:python3-setools = "
 python3
 python3-setuptools
 glibc
 libselinux
 libsepol
"

URI_setools-console = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/setools-console-4.5.1-4.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:setools-console = "
 python3
 libselinux
 python3-setools
"

URI_setools = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/setools-4.5.1-4.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:setools = "
 setools-console-analyses
 setools-gui
 setools-console
"

URI_setools-console-analyses = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/setools-console-analyses-4.5.1-4.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:setools-console-analyses = "
 python3
 libselinux
 python3-networkx
 python3-setools
"

URI_setools-gui = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/setools-gui-4.5.1-4.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:setools-gui = "
 python3
 python3-pyqt6
 python3-setools
 python3-pyqt6-sip
 python3-networkx
"
