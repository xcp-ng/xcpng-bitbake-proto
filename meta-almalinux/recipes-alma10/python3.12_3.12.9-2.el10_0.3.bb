
PN = "python3.12"
PE = "0"
PV = "3.12.9"
PR = "2.el10_0.3"
PACKAGES = "python3 python3-libs python-unversioned-command python3-devel python3-tkinter python3-debug python3-idle python3-test"


URI_python3 = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/python3-3.12.9-2.el10_0.3.x86_64_v2.rpm;unpack=0"
RDEPENDS:python3 = " \
 glibc \
 python3-libs \
"

URI_python3-libs = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/python3-libs-3.12.9-2.el10_0.3.x86_64_v2.rpm;unpack=0"
RDEPENDS:python3-libs = " \
 libuuid \
 zlib-ng-compat \
 tzdata \
 bzip2-libs \
 mpdecimal \
 libffi \
 libxcrypt \
 openssl-libs \
 readline \
 gdbm-libs \
 sqlite-libs \
 bash \
 ncurses-libs \
 expat \
 glibc \
 python3-pip-wheel \
 xz-libs \
"

URI_python-unversioned-command = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/python-unversioned-command-3.12.9-2.el10_0.3.noarch.rpm;unpack=0"
RDEPENDS:python-unversioned-command = " \
 python3 \
"

URI_python3-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/python3-devel-3.12.9-2.el10_0.3.x86_64_v2.rpm;unpack=0"
RDEPENDS:python3-devel = " \
 python3 \
 pkgconf-pkg-config \
 python3-libs \
 python-rpm-macros \
 bash \
 python3-rpm-generators \
 python3-rpm-macros \
"

URI_python3-tkinter = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/python3-tkinter-3.12.9-2.el10_0.3.x86_64_v2.rpm;unpack=0"
RDEPENDS:python3-tkinter = " \
 glibc \
 python3 \
 tk \
 tcl \
"

URI_python3-debug = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/python3-debug-3.12.9-2.el10_0.3.x86_64_v2.rpm;unpack=0"
RDEPENDS:python3-debug = " \
 python3 \
 mpdecimal \
 tcl \
 python3-tkinter \
 ncurses-libs \
 python3-test \
 tk \
 python3-libs \
 xz-libs \
 libuuid \
 zlib-ng-compat \
 libffi \
 libxcrypt \
 openssl-libs \
 sqlite-libs \
 bash \
 expat \
 bzip2-libs \
 readline \
 pkgconf-pkg-config \
 gdbm-libs \
 python3-devel \
 glibc \
 python3-idle \
"

URI_python3-idle = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/python3-idle-3.12.9-2.el10_0.3.x86_64_v2.rpm;unpack=0"
RDEPENDS:python3-idle = " \
 python3 \
 python3-tkinter \
"

URI_python3-test = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/python3-test-3.12.9-2.el10_0.3.x86_64_v2.rpm;unpack=0"
RDEPENDS:python3-test = " \
 python3 \
 python3-wheel-wheel \
 python3-libs \
 bash \
 glibc \
 python3-setuptools-wheel \
"
